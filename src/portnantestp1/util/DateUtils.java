/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package portnantestp1.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author pierre
 */
public class DateUtils {
    /*
     * Var
     */
  public static final String dateFormatNow = "yyyy-MM-dd HH:mm:ss";


  /*
   * Methodes
   */
  public static String now()
  {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormatNow);
    
    return sdf.format(cal.getTime());

  }
}
