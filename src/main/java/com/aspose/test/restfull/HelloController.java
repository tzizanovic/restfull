package com.aspose.test.restfull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/billing/{msisdn}")
    public Billing getCustomerInfo(@PathVariable(name = "msisdn") String msisdn) {
        try {
            String sql = "select  '' as error, t. * from table (get_billing_rplc('"+ msisdn + "')) t";

            List<Billing> billingList = jdbcTemplate.query(
                    sql,
                    new BeanPropertyRowMapper(Billing.class));
            return billingList.get(0);
        } catch (Exception e) {
           return  new Billing(e.getMessage());
            }
    }

    @GetMapping("/hello/req")
    @ResponseBody
    public String getFoos(@RequestParam(required = false) String id) {
        return "ID: " + id;
    }
}