import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Testcontainers
@Execution(ExecutionMode.CONCURRENT)
public class PostgresFreshContainerTest3 {

    @Test
    public void testInsertAndSelect() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE test_table (id INT, name VARCHAR(50))");
                stmt.execute("INSERT INTO test_table VALUES (1, 'Test Name')");

                ResultSet rs = stmt.executeQuery("SELECT name FROM test_table WHERE id = 1");
                rs.next();
                String name = rs.getString("name");

                assertEquals("Test Name", name);
            }
        }
    }

    @Test
    public void testCount() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount1() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount2() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount3() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount4() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount5() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount6() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount7() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount8() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount9() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount10() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount11() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount12() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount13() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount14() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount15() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount16() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount17() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount18() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }
    @Test
    public void testCount19() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount20() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount21() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount22() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount23() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount24() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount25() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount26() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount27() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount28() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount29() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount30() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount31() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount32() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount33() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount34() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount35() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount36() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount37() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount38() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount39() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount40() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }


    @Test
    public void testCount41() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount42() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }

    @Test
    public void testCount43() throws Exception {
        try (PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:13")) {
            postgres.start();

            try (Connection conn = postgres.createConnection("");
                 Statement stmt = conn.createStatement()) {

                stmt.execute("CREATE TABLE another_table (id INT)");
                stmt.execute("INSERT INTO another_table VALUES (1), (2), (3)");

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM another_table");
                rs.next();
                int count = rs.getInt(1);

                assertEquals(3, count);
            }
        }
    }



    // Add more test methods here...
}