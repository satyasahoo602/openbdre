/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wipro.ats.bdre.md.dao;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MI294210 on 10/29/2015.
 */
public class StepDAOTest {
    private static final Logger LOGGER = Logger.getLogger(StepDAOTest.class);

    @Before
    public void init() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        AutowireCapableBeanFactory acbFactory = context.getAutowireCapableBeanFactory();
        acbFactory.autowireBean(this);
    }

    @Autowired
    StepDAO stepDAO;

    @Ignore
    @Test
    public void testInitStep() throws Exception {
        Long sub_instance_exec_id = stepDAO.initStep(10805);
        LOGGER.info("The sub process init step test executed with instance-exec-id :" + sub_instance_exec_id);
    }


    @Test
    public void testTermStep() throws Exception {
        stepDAO.termStep(1356);
        LOGGER.info("The sub process term step test executed");
    }

    @Ignore
    @Test
    public void testHaltStep() throws Exception {
        stepDAO.haltStep(10805);
        LOGGER.info("The sub process halt step test executed");
    }

}
