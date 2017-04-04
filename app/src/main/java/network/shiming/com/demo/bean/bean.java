package network.shiming.com.demo.bean;

import java.util.ArrayList;

import network.shiming.com.network.entities.BaseOneBean;

/**
 * Created by shiming on 2017/4/3.
 */
public class bean extends BaseOneBean{


    @Override

    public String[] uniqueKey() {
        return new String[0];
    }
    public ResultBean mResultBean;
    public class ResultBean {

        public SkBean mSkBean;
        public TodayBean mTodayBean;
        public ArrayList<FutureBean> mFutureBeen;

        public class SkBean {
            public String temp;
            public String wind_direction;
            public String wind_strength;
            public String humidity;
            public String time;

        }

        public class TodayBean {
            public String temperature;
            public String weather;
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

            public class WeatherIdBean {
                public String fa;
                public String fb;
            }
        }

        public class FutureBean {
            public String temperature;
            public String weather;
            public WeatherIdBean weather_id;
            public String wind;
            public String week;
            public String date;

            public class WeatherIdBean {
                public String fa;
                public String fb;

            }
        }

    }
}
