package com.aspose.test.restfull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    public JdbcTemplate jdbcTemplate1;

    @Autowired
    public JdbcTemplate jdbcTemplate2;

    @RequestMapping(value = "/billing/{msisdn}")
    public Billing getCustomerInfo(@PathVariable(name = "msisdn") String msisdn) {
        try {
            String sql = "select  '' as error, t. * from table (get_billing_rplc('"+ msisdn + "')) t";

            List<Billing> billingList = jdbcTemplate1.query(
                    sql,
                    new BeanPropertyRowMapper(Billing.class));
            return billingList.get(0);
        } catch (Exception e) {
           return  new Billing(e.getMessage());
            }
    }
    @RequestMapping(value = "/database/{id}")
    public String getDatabaseInfo(@PathVariable(name = "id") int id) {
        try {
            String sql = "select * from v$version t where rownum = 1";
            String name = null;
           switch (id) {
               case 1:
                   name = jdbcTemplate1.queryForObject(
                           sql,
                           String.class);
                   break;
               case 2:
                   name = jdbcTemplate2.queryForObject(
                           sql,
                           String.class);
           }
            return name;
        } catch (Exception e) {
            return  e.getMessage();
        }
    }
    @GetMapping("/hello/req")
    @ResponseBody
    public String getFoos(@RequestParam(required = false) String id) {
        return "ID: " + id;
    }
}