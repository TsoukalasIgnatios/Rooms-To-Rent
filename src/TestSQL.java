import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.TestCase;


public class TestSQL extends TestCase {

	/*
	 * Test method for 'SQLUtilities.connect()'
	 */
	public void testConnect() {
		Connection con = SQLUtilities.connect();
		ResultSet set = SQLUtilities.executeSQL("SELECT * FROM TBL", con);
		
		try {
			set.last();
			int indx = set.getRow();
			System.out.println(indx);
		} catch (SQLException e) {
			fail();
			e.printStackTrace();
		}
		
		SQLUtilities.disconnect(con);
		assertEquals(true,true);

	}

}
