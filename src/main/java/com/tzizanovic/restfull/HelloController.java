package com.tzizanovic.restfull;

import com.tzizanovic.billing.CustomerMainInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    public JdbcTemplate jdbcTemplate1;

    @Autowired
    public JdbcTemplate jdbcTemplate2;

    @RequestMapping(value = "/billing/{msisdn}")
    public CustomerMainInfo getCustomerInfo(@PathVariable(name = "msisdn") String msisdn) {
        try {
            String sql = "select  '' as error, t. * from table (get_billing_rplc('" + msisdn + "')) t";

            List<CustomerMainInfo> billingList = jdbcTemplate1.query(
                    sql,
                    new BeanPropertyRowMapper(CustomerMainInfo.class));
            return billingList.get(0);
        } catch (Exception e) {
            return new CustomerMainInfo(e.getMessage());
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
                    break;
            }
            return name;
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}