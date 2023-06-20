基础数据：
```
PUT employees

PUT employees/_mapping
{
  "properties": {
    "date_of_birth": {
      "type": "date",
      "format": "dd/MM/yyyy"
    }
  }
}


POST _bulk
{"index":{"_index":"employees","_id":"1"}}
{"id":1,"name":"Huntlee Dargavel","email":"hdargavel0@japanpost.jp","gender":"male","ip_address":"58.11.89.193","date_of_birth":"11/09/1990","company":"Talane","position":"Research Associate","experience":7,"country":"China","phrase":"Multi-channelled coherent leverage","salary":180025}
{"index":{"_index":"employees","_id":"2"}}
{"id":2,"name":"Othilia Cathel","email":"ocathel1@senate.gov","gender":"female","ip_address":"3.164.153.228","date_of_birth":"22/07/1987","company":"Edgepulse","position":"Structural Engineer","experience":11,"country":"China","phrase":"Grass-roots heuristic help-desk","salary":193530}
{"index":{"_index":"employees","_id":"3"}}
{"id":3,"name":"Winston Waren","email":"wwaren2@4shared.com","gender":"male","ip_address":"202.37.210.94","date_of_birth":"10/11/1985","company":"Yozio","position":"Human Resources Manager","experience":12,"country":"China","phrase":"Versatile object-oriented emulation","salary":50616}
{"index":{"_index":"employees","_id":"4"}}
{"id":4,"name":"Alan Thomas","email":"athomas2@example.com","gender":"male","ip_address":"200.47.210.95","date_of_birth":"11/12/1985","company":"Yamaha","position":"Resources Manager","experience":12,"country":"China","phrase":"Emulation of roots heuristic coherent systems","salary":300000}


```
练习
模糊查询
前缀查询
精确查询
查询不存在
范围查询
正则查询
排序

```
POST employees/_search
{
  "query": {
    "match": {
      "phrase":  "heuristic roots help"
    }
  }
}


POST employees/_search
{
  "query": {
    "match": {
      "phrase": {
        "query": "heuristic roots help",
        "operator": "and"
      }
    }
  }
}

POST employees/_search
{
  "query": {
    "match": {
      "phrase": {
        "query": "heuristic roots help",
        "minimum_should_match": 1
      }
    }
  }
}


POST employees/_search
{
  "query": {
    "multi_match": {
      "query": "research help",
      "fields": [
        "position",
        "phrase"
      ]
    }
  }
}


POST employees/_search
{
  "query": {
    "match_phrase": {
      "phrase": "roots coherent"
    } 
  }
}

POST employees/_search
{
  "query": {
    "match_phrase": {
      "phrase": {
        "query": "roots coherent",
        "slop": 1
      }
    }
  }
}


PUT employees/_doc/5
{
  "id": 4,
  "name": "Jennifer Lawrence",
  "email": "jlaw@example.com",
  "gender": "female",
  "ip_address": "100.37.110.59",
  "date_of_birth": "17/05/1995",
  "company": "Monsnto",
  "position": "Resources Manager",
  "experience": 10,
  "country": "Germany",
  "phrase": "Emulation of roots heuristic complete systems",
  "salary": 300000
}

POST employees/_search
{
  "query": {
    "match_phrase_prefix": {
      "phrase": {
        "query": "roots heuristic c"
      }
    } 
  }
}


GET employees/_search
{
  "_source": [
    "phrase"
  ],
  "query": {
    "match_phrase_prefix": {
      "phrase": {
        "query": "roots heuristic co",
        "max_expansions": 1
      }
    }
  }
}

DELETE employees/_doc/5

POST employees/_search


POST employees/_search
{
  "query": {
    "term": {
      "gender": {
        "value": "Male"
      }
    } 
  }
}

POST employees/_search
{
  "query": {
    "terms": {
      "gender": [
        "male",
        "female"
      ]
    }
  }
}



PUT employees/_doc/5
{
  "id": 5,
  "name": "Michael Bordon",
  "email": "mbordon@example.com",
  "gender": "male",
  "ip_address": "10.47.210.65",
  "date_of_birth": "12/12/1995",
  "position": "Resources Manager",
  "experience": 12,
  "country": null,
  "phrase": "Emulation of roots heuristic coherent systems",
  "salary": 300000
}



POST employees/_search
{
  "query": {
    "exists": {
      "field": "company"
    }
  }
}



POST employees/_search
{
  "query": {
    "bool": {
      "must_not": [
        {
          "exists": {
            "field": "company"
          }
        }
      ]
    }
    
  }
}


DELETE employees/_doc/5



POST employees/_search
{
  "query": {
    "range": {
      "experience": {
        "gte": 5,
        "lte": 10
      }
    }
    
  }
}



POST employees/_search
{
  "query": {
    "ids": {
      "values": [1,2]
    }
  }
}


POST employees/_search
{
  "query": {
    "prefix": {
      "name": "al"
    }
  }
}



POST employees/_search
{
  "query": {
    "wildcard": {
      "country": "c*a"
    }
  }
}

POST employees/_search
{
  "query": {
    "regexp": {
      "position": "res[a-z]*"
    }
  }
}


POST employees/_search
{
  "query": {
    "fuzzy": {
      "country": {
        "value": "chnia",
        "fuzziness": 2
      }
    }
  }
}


POST employees/_search
{
    "query": {
        "multi_match" : {
            "query" : "versatile Engineer",
            "fields": ["position^3", "phrase"]
        }
    }
}

POST employees/_search
{
  "_source": [
      "name",
      "experience",
      "salary"
    ],
    "sort": [
      {
       "experience": {
          "order": "desc"
        }
      },
      {
        "salary": {
          "order": "desc"
        }
      }
    ]
}
```