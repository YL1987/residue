package com.test.myapplication.entity;

import com.test.myapplication.engine.BasicResponse;

import java.util.List;

/**
 * 项目名称：thefirstdoor
 * 类描述：
 * 创建人：wyd
 * 创建时间：2017/3/9 下午2:50
 * 修改人：wyd
 * 修改时间：2017/3/9 下午2:50
 * 修改备注：
 */
public class HomeLatestEntity extends BasicResponse {


    /**
     * extra : null
     * data : {"data":[{"live_record_id":10777,"broker_uid":266,"live_type":"new","house_id":738,"is_live":false,"watch_num":1,"price":"","project_name":"哈哈哈的","project_img":"https://my.onedoor.com/upload/images/2016/12/21//1482319851422371.jpeg","layout":null,"pro_id":1,"city_id":90001,"area_id":37,"property":"住宅","release_type":3,"city_name":"北京市","area_name":"东城区","share_reward_id":17,"share_type":"picture","share_link":"","share_content":null,"share_live_id":null,"share_silver":200,"share_silver_client":100,"share_rest_count":100,"share_max_count":200,"share_image_url":"http://oddev.7door.cc/upload/users/8/1SNoOutFGPJP.png","share_image_width":640,"share_image_height":571},{"live_record_id":10931,"broker_uid":818,"live_type":"new","house_id":748,"is_live":false,"watch_num":0,"price":"","project_name":"再来","project_img":"https://my.onedoor.com/upload/images/2016/12/22//1482378468732475.jpeg","layout":null,"pro_id":1,"city_id":90001,"area_id":37,"release_type":1,"property":"商业","city_name":"北京市","area_name":"东城区"}],"hot_live_record_ids":"48,535,491,254,250,419,5,523,4,218,818,279,634,219,266,935,905,896,912"}
     */

    public DataBeanX data;

    @Override
    public String toString() {
        return "HomeLatestEntity{" +
                "data=" + data +
                '}';
    }

    public static class DataBeanX {
        /**
         * data : [{"live_record_id":10777,"broker_uid":266,"live_type":"new","house_id":738,"is_live":false,"watch_num":1,"price":"","project_name":"哈哈哈的","project_img":"https://my.onedoor.com/upload/images/2016/12/21//1482319851422371.jpeg","layout":null,"pro_id":1,"city_id":90001,"area_id":37,"property":"住宅","release_type":3,"city_name":"北京市","area_name":"东城区","share_reward_id":17,"share_type":"picture","share_link":"","share_content":null,"share_live_id":null,"share_silver":200,"share_silver_client":100,"share_rest_count":100,"share_max_count":200,"share_image_url":"http://oddev.7door.cc/upload/users/8/1SNoOutFGPJP.png","share_image_width":640,"share_image_height":571},{"live_record_id":10931,"broker_uid":818,"live_type":"new","house_id":748,"is_live":false,"watch_num":0,"price":"","project_name":"再来","project_img":"https://my.onedoor.com/upload/images/2016/12/22//1482378468732475.jpeg","layout":null,"pro_id":1,"city_id":90001,"area_id":37,"release_type":1,"property":"商业","city_name":"北京市","area_name":"东城区"}]
         * hot_live_record_ids : 48,535,491,254,250,419,5,523,4,218,818,279,634,219,266,935,905,896,912
         */

        public String hot_live_record_ids;
        public List<DataBean> data;

        @Override
        public String toString() {
            return "DataBeanX{" +
                    "hot_live_record_ids='" + hot_live_record_ids + '\'' +
                    ", data=" + data +
                    '}';
        }

        public static class DataBean {
            /**
             * live_record_id : 10777
             * broker_uid : 266
             * live_type : new
             * house_id : 738
             * is_live : false
             * watch_num : 1
             * price :
             * project_name : 哈哈哈的
             * project_img : https://my.onedoor.com/upload/images/2016/12/21//1482319851422371.jpeg
             * layout : null
             * pro_id : 1
             * city_id : 90001
             * area_id : 37
             * property : 住宅
             * release_type : 3
             * city_name : 北京市
             * area_name : 东城区
             * share_reward_id : 17
             * share_type : picture
             * share_link :
             * share_content : null
             * share_live_id : null
             * share_silver : 200
             * share_silver_client : 100
             * share_rest_count : 100
             * share_max_count : 200
             * share_image_url : http://oddev.7door.cc/upload/users/8/1SNoOutFGPJP.png
             * share_image_width : 640
             * share_image_height : 571
             */
            public String avatar;
            public int live_record_id;
            public int broker_uid;
            public String live_type;
            public int house_id;
            public boolean is_live;
            public int watch_num;
            public int level;
            public String nickname;
            public String price;
            public String project_name;
            public String project_img;
            public Object layout;
            public int pro_id;
            public int city_id;
            public int area_id;
            public String property;
            public int release_type;
            public String avatar_thumb_url;
            public String avatar_url;
            public String city_name;
            public String area_name;
            public int share_reward_id;
            public String share_type;
            public String share_link;
            public Object share_content;
            public Object share_live_id;
            public int share_silver;
            public int share_silver_client;
            public int share_rest_count;
            public int share_max_count;
            public String share_image_url;
            public int share_image_width;
            public int share_image_height;
            public boolean is_redpack;
            public boolean is_extern;

            @Override
            public String toString() {
                return "DataBean{" +
                        "avatar='" + avatar + '\'' +
                        ", live_record_id=" + live_record_id +
                        ", broker_uid=" + broker_uid +
                        ", live_type='" + live_type + '\'' +
                        ", house_id=" + house_id +
                        ", is_live=" + is_live +
                        ", watch_num=" + watch_num +
                        ", level=" + level +
                        ", nickname='" + nickname + '\'' +
                        ", price='" + price + '\'' +
                        ", project_name='" + project_name + '\'' +
                        ", project_img='" + project_img + '\'' +
                        ", layout=" + layout +
                        ", pro_id=" + pro_id +
                        ", city_id=" + city_id +
                        ", area_id=" + area_id +
                        ", property='" + property + '\'' +
                        ", release_type=" + release_type +
                        ", avatar_thumb_url='" + avatar_thumb_url + '\'' +
                        ", avatar_url='" + avatar_url + '\'' +
                        ", city_name='" + city_name + '\'' +
                        ", area_name='" + area_name + '\'' +
                        ", share_reward_id=" + share_reward_id +
                        ", share_type='" + share_type + '\'' +
                        ", share_link='" + share_link + '\'' +
                        ", share_content=" + share_content +
                        ", share_live_id=" + share_live_id +
                        ", share_silver=" + share_silver +
                        ", share_silver_client=" + share_silver_client +
                        ", share_rest_count=" + share_rest_count +
                        ", share_max_count=" + share_max_count +
                        ", share_image_url='" + share_image_url + '\'' +
                        ", share_image_width=" + share_image_width +
                        ", share_image_height=" + share_image_height +
                        ", is_redpack=" + is_redpack +
                        ", is_extern=" + is_extern +
                        '}';
            }
        }
    }
}
