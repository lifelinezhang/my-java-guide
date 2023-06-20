
```
DELETE /crm_moments

PUT crm_moments



PUT crm_moments/_mapping
{
  "properties": {
    "create_time": {
      "type": "date",
      "format": "yyyy-MM-dd"
    },
    "update_time": {
      "type": "date",
      "format": "yyyy-MM-dd"
    }
  }
}




POST _bulk
{"index":{"_index":"crm_moments","_id":"1"}}
{"id":1,"customer_id":133,"content":"大众朗逸黑色 1250","img_urls":"https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg","video_urls":"https://suncars-1251117131.cos.ap-shanghai.myqcloud.com/video/2022chetuannewyear.MP4","imgType":"7","deleted":0,"creator":"aaa","create_time":"2023-06-19","updater":"bbb","update_time":"2023-06-20","tenant_id":30}
{"index":{"_index":"crm_moments","_id":"2"}}
{"id":2,"customer_id":133,"content":"雪铁龙 幻影  1230 黑色","img_urls":"https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg","video_urls":"https://suncars-1251117131.cos.ap-shanghai.myqcloud.com/video/2022chetuannewyear.MP4","imgType":"7","deleted":0,"creator":"aaa","create_time":"2023-06-19","updater":"bbb","update_time":"2023-06-20","tenant_id":30}
{"index":{"_index":"crm_moments","_id":"3"}}
{"id":3,"customer_id":133,"content":"奔驰 2340 2023 红","img_urls":"https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg","video_urls":"https://suncars-1251117131.cos.ap-shanghai.myqcloud.com/video/2022chetuannewyear.MP4","imgType":"7","deleted":0,"creator":"aaa","create_time":"2023-06-19","updater":"bbb","update_time":"2023-06-20","tenant_id":30}
{"index":{"_index":"crm_moments","_id":"4"}}
{"id":4,"customer_id":133,"content":"东风雪铁龙 凡尔赛 1123 红色","img_urls":"https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg","video_urls":"https://suncars-1251117131.cos.ap-shanghai.myqcloud.com/video/2022chetuannewyear.MP4","imgType":"7","deleted":0,"creator":"aaa","create_time":"2023-06-19","updater":"bbb","update_time":"2023-06-20","tenant_id":30}



POST crm_moments/_search
{
  "query": {
    "match": {
      "content": {
        "query": "凡赛",
        "minimum_should_match": 1
      }
    }
  }
}


POST crm_moments/_doc/5
{"id":5,"customer_id":133,"content":"东风雪铁龙 凡尔赛 1123 红色","img_urls":"https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg,https://maiwo-saas-1251117131.cos.ap-shanghai.myqcloud.com/CXWarehouse/1685676136481_284.jpg","video_urls":"https://suncars-1251117131.cos.ap-shanghai.myqcloud.com/video/2022chetuannewyear.MP4","imgType":"7","deleted":1,"creator":"aaa","create_time":"2023-06-19","updater":"bbb","update_time":"2023-06-20","tenant_id":30}






GET crm_moments/_search
{
  "query": {
    "bool": {
      "must": [
        {
          "match": {
            "deleted": 0
          }
        },
        {
          "match": {
            "content": "雪铁龙 奔驰"
          }
        }
      ]
    }
  },
  "size": 2,
  "from": 0,
  "sort": [
    {
      "create_time": {
        "order": "desc"
      }
    },
    {
      "id": {
        "order": "desc"
      }
    }
  ],
  "search_after": [
    1687132800000,
    3
  ],
  "highlight": {
    "boundary_scanner_locale": "zh_CN",
    "fields": {
      "content": {
        "pre_tags": [
          "<em>"
        ],
        "post_tags": [
          "</em>"
        ]
      }
    }
  }
}















```