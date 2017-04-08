package network.shiming.com.network.retrofit;


import network.shiming.com.network.entities.BaseOneBean;


/**
 * Created by shiming on 2017/4/3.
 * 服务器返回的状态   这需要和服务器自定义
 * {
 "resultcode":"200",
 "reason":"successed!",
 "result":{
 "sk":{
 "temp":"16",
 "wind_direction":"西风",
 "wind_strength":"2级",
 "humidity":"74%",
 "time":"14:07"
 },
 "today":{
 "temperature":"12℃~18℃",
 "weather":"阴转小雨",
 "weather_id":{
 "fa":"02",
 "fb":"07"
 },
 "wind":"北风微风",
 "week":"星期一",
 "city":"成都",
 "date_y":"2017年04月03日",
 "dressing_index":"较冷",
 "dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。",
 "uv_index":"最弱",
 "comfort_index":"",
 "wash_index":"不宜",
 "travel_index":"较不宜",
 "exercise_index":"较不宜",
 "drying_index":""
 },
 "future":{
 "day_20170403":{
 "temperature":"12℃~18℃",
 "weather":"阴转小雨",
 "weather_id":{
 "fa":"02",
 "fb":"07"
 },
 "wind":"北风微风",
 "week":"星期一",
 "date":"20170403"
 },
 "day_20170404":{
 "temperature":"12℃~23℃",
 "weather":"多云转小雨",
 "weather_id":{
 "fa":"01",
 "fb":"07"
 },
 "wind":"南风微风",
 "week":"星期二",
 "date":"20170404"
 },
 "day_20170405":{
 "temperature":"15℃~23℃",
 "weather":"多云",
 "weather_id":{
 "fa":"01",
 "fb":"01"
 },
 "wind":"南风微风",
 "week":"星期三",
 "date":"20170405"
 },
 "day_20170406":{
 "temperature":"15℃~23℃",
 "weather":"多云",
 "weather_id":{
 "fa":"01",
 "fb":"01"
 },
 "wind":"南风微风",
 "week":"星期四",
 "date":"20170406"
 },
 "day_20170407":{
 "temperature":"15℃~22℃",
 "weather":"多云转小雨",
 "weather_id":{
 "fa":"01",
 "fb":"07"
 },
 "wind":"南风微风",
 "week":"星期五",
 "date":"20170407"
 },
 "day_20170408":{
 "temperature":"15℃~23℃",
 "weather":"多云",
 "weather_id":{
 "fa":"01",
 "fb":"01"
 },
 "wind":"南风微风",
 "week":"星期六",
 "date":"20170408"
 },
 "day_20170409":{
 "temperature":"12℃~23℃",
 "weather":"多云转小雨",
 "weather_id":{
 "fa":"01",
 "fb":"07"
 },
 "wind":"南风微风",
 "week":"星期日",
 "date":"20170409"
 }
 }
 },
 "error_code":0
 }
 */

// 没有服务器  这里使用的 聚合数据查询的免费的新闻
//  用户名 ：15118531365  密码 ：lishiming
//    只有500次   节约到用
//    https://www.juhe.cn/box/index/id/39
public class SMResponse<T> extends BaseOneBean {

    public T result; // // TODO: 2017/4/8   这里哈哈
    public String reason;
    public int error_code;

    @Override
    public String[] uniqueKey() {
        return new String[]{""};
    }
}
