package network.shiming.com.demo.bean;

import java.util.ArrayList;


import network.shiming.com.network.entities.BaseOneBean;

/**
 * Created by shiming on 2017/4/4.
 */
public class MuerDataBean extends BaseOneBean{
    
    
        public String totalNum;
        public int pn;
        public int rn;
        /**
         * id : 177
         * title : 木耳宫保鸡丁
         * tags : 家常菜;麻辣;炒;母亲节
         * imtro : 清清楚楚记得小时候妈妈常与阿姨们厨艺交流。其中有一道印象最深，那就是去皮花生米与肉丁一起炒，一个焦脆，一个软滑；一个白黄，一个酱红；略带点辣味，我很是喜爱。不过不知道叫啥个名子，直到来到了挪威才知晓，差不多每一个中国餐馆都有这道菜“宫保鸡丁”。在餐馆打工时就见到一位年轻的挪威人差不多每周都来买，而且只点这一道菜，他认为这就是“天上人间”——中国菜的全部。 我也不知怎样做才是正宗的，只知从小到大受到妈妈的影响，注重色香味。因此就加了一点黑色的木耳，这样在色彩上除白黄和酱红，又加了一个亮黑，最后来点蒜苗点缀，看上去很是喜人，老公说配中国白酒最合适不过了。 木耳，我常常用来配菜，这还是从妈妈给我看了一本老年人手抄手册开始的。上面记述了一个真人故事，一位老人在美国因洋餐的油脂过多摄入，血脂偏高，可是回国几月，再检查一切正常了，只因他常食木耳的原因。 现在玩美食常常注重营养学，木耳除降脂以外，可养血驻颜，防治缺铁性贫血；还可对付粉尘污染，这一点最感兴趣。 妈妈说现在到处灰灰的，根本就不感出门，那就给她老上一盘木耳宫保鸡丁，将红辣椒，整只油煎，然后夹出，因她老不能吃辣，辣子留给爱吃辣的我享用去吧。
         * ingredients : 鸡胸肉,160g;花生米,60g;泡发木耳,60g
         * burden : 油,适量;盐,适量;葱,适量;干辣椒,适量;花椒,适量;生抽,适量;老抽,适量;胡椒粉,适量;蛋清,适量;白砂糖,适量;淀粉,适量;大蒜,适量;姜,适量
         * albums : ["http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/t/1/177_265149.jpg"]
         * steps : [{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_cab7f86699c90bd1.jpg","step":"1.备好食材：鸡胸肉160克，花生米60克，泡发木耳60克，葱姜蒜、干辣椒和花椒适量。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_62cb7550de78b340.jpg","step":"2.用开水冲泡花生米，剥去外皮。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_1d789cb011ad28a1.jpg","step":"3.木耳切小块。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_dc992906ee6fac89.jpg","step":"4.鸡胸肉切丁，还有木耳和葱姜蒜也切好备用。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_75c859166833a1eb.jpg","step":"5.取一小碗，放入鸡丁，加入老抽、盐、糖、胡椒、淀粉和一勺蛋清，用手抓均。注：用手抓均易入味，食物带有你的体温和心情。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_ed4e394d80df4c0f.jpg","step":"6.调一小碗芡汁：淀粉、生抽和水或高汤。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_7f12be59df0118eb.jpg","step":"7.冷锅冷油下花生米。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_91dcf3bde3f2d419.jpg","step":"8.中火炒至浅焦黄色，盛到大点的盘子里，方便散热。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_2e7ea02440ff74e1.jpg","step":"9.用原油下干辣椒和花椒，还是中火，炸到香，将辣椒夹出，留给能吃辣的享用。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_911469dc5eadff06.jpg","step":"10.然后下葱姜蒜爆香。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_5d495c2b0a498c90.jpg","step":"11.紧接着下鸡丁。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_430c87596c852479.jpg","step":"12.将鸡丁滑炒变色，下木耳。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_08c512f88917666f.jpg","step":"13.当木耳炒的有点炸锅时，倒入芡汁。"},{"img":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_9752b6dd64491cf0.jpg","step":"14.翻均，下炸好的花生米，快速拌均即可起锅。"}]
         */
        public ArrayList<DataBean> data;

    @Override
    public String[] uniqueKey() {
        return new String[]{"101"};
    }


    public  class DataBean {
            public String id;
            public String title;
            public String tags;
            public String imtro;
            public String ingredients;
            public String burden;
            public ArrayList<String> albums;
            /**
             * img : http://juheimg.oss-cn-hangzhou.aliyuncs.com/cookbook/s/2/177_cab7f86699c90bd1.jpg
             * step : 1.备好食材：鸡胸肉160克，花生米60克，泡发木耳60克，葱姜蒜、干辣椒和花椒适量。
             */

            public ArrayList<StepsBean> steps;

            public  class StepsBean {
                public String img;
                public String step;
                
            }
        }
    
}
