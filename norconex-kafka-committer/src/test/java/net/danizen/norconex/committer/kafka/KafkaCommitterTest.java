/* Copyright 2017 Daniel Davis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.danizen.norconex.committer.kafka;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.lang3.ClassUtils;
import org.apache.log4j.Level;
import org.junit.Assert;
import org.junit.Test;

//import com.norconex.commons.lang.config.XMLConfigurationUtil;
//import com.norconex.commons.lang.log.CountingConsoleAppender;

//https://www.elastic.co/guide/en/elasticsearch/reference/current/integration-tests.html
// 
// UNCOMMENT TO TEST, after uncommenting in pom.xml as well
// 
// Some IDEs will include test scoped dependencies on classpath when running
// normally from IDE (not testing) and will fail since 
//com.carrotsearch.randomizedtesting.RandomizedContext will be on classpath.
// When that occurs, this exception is thrown: "java.lang.IllegalStateException: 
//     running tests but failed to invoke RandomizedContext#getRandom".
//
// Uncomment this class for good when no longer an issue in a future Elasticsearch

public class KafkaCommitterTest {
    @Test
    public void testStub() {
        Assert.assertTrue("Stub condition is true", true);
    }
}