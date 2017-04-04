package network.shiming.com.demo.bean;

import java.util.ArrayList;

import network.shiming.com.network.entities.BaseOneBean;

/**
 * Created by shiming on 2017/4/3.
 */
public class TestBean extends BaseOneBean {

//   以下的四种  我们都在我们的respose包装了  ，我们就不需要在进行 包装了
//    public String resultcode;
//    public String reason;
//    public ResultBean result;
//    public int error_code;

    @Override
    public String[] uniqueKey() {
        return new String[0];
    }

        public SkBean sk;
        /**
         * temperature : 17℃~26℃
         * weather : 多云
         * weather_id : {"fa":"01","fb":"01"}
         * wind : 微风
         * week : 星期一
         * city : 深圳
         * date_y : 2017年04月03日
         * dressing_index : 舒适
         * dressing_advice : 建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。
         * uv_index : 弱
         * comfort_index :
         * wash_index : 较适宜
         * travel_index : 适宜
         * exercise_index : 适宜
         * drying_index :
         */

        public TodayBean today;
        /**
         * temperature : 17℃~26℃
         * weather : 多云
         * weather_id : {"fa":"01","fb":"01"}
         * wind : 微风
         * week : 星期一
         * date : 20170403
         */

        public ArrayList<TodayBean.FutureBean> future;


        public static class SkBean {
            public String temp;
            public String wind_direction;
            public String wind_strength;
            public String humidity;
            public String time;

        }

        public static class TodayBean {
            public String temperature;
            public String weather;
            /**
             * fa : 01
             * fb : 01
             */

            public WeatherIdBean weather_id;
            public String wind;
            public String week;
            public String city;
            public String date_y;
            public String dressing_index;
            public String dressing_advice;
            public String uv_index;
            public String comfort_index;
            public String wash_index;
            public String travel_index;
            public String exercise_index;
            public String drying_index;


            public static class WeatherIdBean {
                public String fa;
                public String fb;


            }

            public static class FutureBean {
                public String temperature;
                public String weather;
                /**
                 * fa : 01
                 * fb : 01
                 */

                public WeatherIdBean weather_id;
                public String wind;
                public String week;
                public String date;

                public static class WeatherIdBean {
                    public String fa;
                    public String fb;


                }
            }
        }
    }





