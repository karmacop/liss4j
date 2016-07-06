/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package liss;

/**
 *
 * @author Glenn Tester
 */
public class DailyDataList extends LissGenericList<DailyData> {

    public DailyDataList() {
        super();
    }
    
    public DailyDataList(DailyData[] dailyDatas) {
        super(dailyDatas, DailyData.class);
    }
    
}
