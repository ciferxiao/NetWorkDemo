package network.shiming.com.demo.bean;

/**
 * Created by shiming on 2017/4/4.
 */
public class TestBeanDemo {

    /**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"25","wind_direction":"东南风","wind_strength":"3级","humidity":"57%","time":"11:48"},"today":{"temperature":"20℃~25℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"微风","week":"星期二","city":"深圳","date_y":"2017年04月04日","dressing_index":"舒适","dressing_advice":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。","uv_index":"弱","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""},"future":{"day_20170404":{"temperature":"20℃~25℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"微风","week":"星期二","date":"20170404"},"day_20170405":{"temperature":"21℃~26℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"微风","week":"星期三","date":"20170405"},"day_20170406":{"temperature":"21℃~25℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期四","date":"20170406"},"day_20170407":{"temperature":"22℃~29℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"微风","week":"星期五","date":"20170407"},"day_20170408":{"temperature":"21℃~29℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期六","date":"20170408"},"day_20170409":{"temperature":"22℃~29℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"微风","week":"星期日","date":"20170409"},"day_20170410":{"temperature":"21℃~25℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期一","date":"20170410"}}}
     * error_code : 0
     */

    /**
     * sk : {"temp":"25","wind_direction":"东南风","wind_strength":"3级","humidity":"57%","time":"11:48"}
     * today : {"temperature":"20℃~25℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"微风","week":"星期二","city":"深圳","date_y":"2017年04月04日","dressing_index":"舒适","dressing_advice":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。","uv_index":"弱","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""}
     * future : {"day_20170404":{"temperature":"20℃~25℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"微风","week":"星期二","date":"20170404"},"day_20170405":{"temperature":"21℃~26℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"微风","week":"星期三","date":"20170405"},"day_20170406":{"temperature":"21℃~25℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期四","date":"20170406"},"day_20170407":{"temperature":"22℃~29℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"微风","week":"星期五","date":"20170407"},"day_20170408":{"temperature":"21℃~29℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期六","date":"20170408"},"day_20170409":{"temperature":"22℃~29℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"微风","week":"星期日","date":"20170409"},"day_20170410":{"temperature":"21℃~25℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期一","date":"20170410"}}
     */

    private ResultBean result;



    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * temp : 25
         * wind_direction : 东南风
         * wind_strength : 3级
         * humidity : 57%
         * time : 11:48
         */

        private SkBean sk;
        /**
         * temperature : 20℃~25℃
         * weather : 多云
         * weather_id : {"fa":"01","fb":"01"}
         * wind : 微风
         * week : 星期二
         * city : 深圳
         * date_y : 2017年04月04日
         * dressing_index : 舒适
         * dressing_advice : 建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。
         * uv_index : 弱
         * comfort_index :
         * wash_index : 较适宜
         * travel_index : 较适宜
         * exercise_index : 较适宜
         * drying_index :
         */

        private TodayBean today;
        /**
         * day_20170404 : {"temperature":"20℃~25℃","weather":"多云","weather_id":{"fa":"01","fb":"01"},"wind":"微风","week":"星期二","date":"20170404"}
         * day_20170405 : {"temperature":"21℃~26℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"微风","week":"星期三","date":"20170405"}
         * day_20170406 : {"temperature":"21℃~25℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期四","date":"20170406"}
         * day_20170407 : {"temperature":"22℃~29℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"微风","week":"星期五","date":"20170407"}
         * day_20170408 : {"temperature":"21℃~29℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期六","date":"20170408"}
         * day_20170409 : {"temperature":"22℃~29℃","weather":"阴转小雨","weather_id":{"fa":"02","fb":"07"},"wind":"微风","week":"星期日","date":"20170409"}
         * day_20170410 : {"temperature":"21℃~25℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"微风","week":"星期一","date":"20170410"}
         */

        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean {
            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }



            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean {
            private String temperature;
            private String weather;
            /**
             * fa : 01
             * fb : 01
             */

            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {
                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean {
            /**
             * temperature : 20℃~25℃
             * weather : 多云
             * weather_id : {"fa":"01","fb":"01"}
             * wind : 微风
             * week : 星期二
             * date : 20170404
             */

            private Day20170404Bean day_20170404;
            /**
             * temperature : 21℃~26℃
             * weather : 多云转阴
             * weather_id : {"fa":"01","fb":"02"}
             * wind : 微风
             * week : 星期三
             * date : 20170405
             */

            private Day20170405Bean day_20170405;
            /**
             * temperature : 21℃~25℃
             * weather : 小雨
             * weather_id : {"fa":"07","fb":"07"}
             * wind : 微风
             * week : 星期四
             * date : 20170406
             */

            private Day20170406Bean day_20170406;
            /**
             * temperature : 22℃~29℃
             * weather : 阴转小雨
             * weather_id : {"fa":"02","fb":"07"}
             * wind : 微风
             * week : 星期五
             * date : 20170407
             */

            private Day20170407Bean day_20170407;
            /**
             * temperature : 21℃~29℃
             * weather : 小雨
             * weather_id : {"fa":"07","fb":"07"}
             * wind : 微风
             * week : 星期六
             * date : 20170408
             */

            private Day20170408Bean day_20170408;
            /**
             * temperature : 22℃~29℃
             * weather : 阴转小雨
             * weather_id : {"fa":"02","fb":"07"}
             * wind : 微风
             * week : 星期日
             * date : 20170409
             */

            private Day20170409Bean day_20170409;
            /**
             * temperature : 21℃~25℃
             * weather : 小雨
             * weather_id : {"fa":"07","fb":"07"}
             * wind : 微风
             * week : 星期一
             * date : 20170410
             */

            private Day20170410Bean day_20170410;

            public Day20170404Bean getDay_20170404() {
                return day_20170404;
            }

            public void setDay_20170404(Day20170404Bean day_20170404) {
                this.day_20170404 = day_20170404;
            }

            public Day20170405Bean getDay_20170405() {
                return day_20170405;
            }

            public void setDay_20170405(Day20170405Bean day_20170405) {
                this.day_20170405 = day_20170405;
            }

            public Day20170406Bean getDay_20170406() {
                return day_20170406;
            }

            public void setDay_20170406(Day20170406Bean day_20170406) {
                this.day_20170406 = day_20170406;
            }

            public Day20170407Bean getDay_20170407() {
                return day_20170407;
            }

            public void setDay_20170407(Day20170407Bean day_20170407) {
                this.day_20170407 = day_20170407;
            }

            public Day20170408Bean getDay_20170408() {
                return day_20170408;
            }

            public void setDay_20170408(Day20170408Bean day_20170408) {
                this.day_20170408 = day_20170408;
            }

            public Day20170409Bean getDay_20170409() {
                return day_20170409;
            }

            public void setDay_20170409(Day20170409Bean day_20170409) {
                this.day_20170409 = day_20170409;
            }

            public Day20170410Bean getDay_20170410() {
                return day_20170410;
            }

            public void setDay_20170410(Day20170410Bean day_20170410) {
                this.day_20170410 = day_20170410;
            }

            public static class Day20170404Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 01
                 * fb : 01
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170405Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 01
                 * fb : 02
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170406Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 07
                 * fb : 07
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170407Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 02
                 * fb : 07
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170408Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 07
                 * fb : 07
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170409Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 02
                 * fb : 07
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170410Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 07
                 * fb : 07
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }
    }
}
