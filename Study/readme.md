# [BlockChain Project 가이드 라인]

## 개요
Postman 혹은 Webpage에서 BlockChain, txData 조회 및 채굴

* 기존 블록체인의 채굴 자동화 및 DB 저장
* 웹페이지를 통한 데이터 조회

![blockchain project](https://i.imgur.com/CtALucG.png)

## 필수 프로그램
* mySql(HeidiSQL)
* Pycharm
* Nodejs

PyCharm 프로그램에서 필요 라이브러리 modul 설치, 로컬 혹은 서버에 mySql Database 생성

### blockchain

|    *NAME*    | *DATA TYPE* | *LENGTH* | *PRIMARY KEY* |
| -------------| ----------- | ---------| --------------|
| NO           | INT         | 11       |       O       |
| PREVIOUSHASH | VARCHAR     | 1000     |               |
| TIMESTAMP    | VARCHAR     | 1000     |               |
| DATA         | VARCHAR     | 1000     |               |
| CURRENTHASH  | VARCHAR     | 1000     |               |
| PROOF        | INT         | 11       |               |
| FEE          | DOUBLE      |          |               |
| SIGNATURE    | VARCHAR     | 1000     |               |

### txdata

|    *NAME*    | *DATA TYPE* | *LENGTH* | *PRIMARY KEY* |
| -------------| ----------- | ---------| --------------|
| COMMITYN     | INT         | 11       |               |
| SENDER       | VARCHAR     | 1000     |               |
| AMOUNT       | VARCHAR     | 1000     |               |
| RECEIVER     | VARCHAR     | 50       |               |
| UUID         | BLOB        |          |       O       |
| FEE          | DOUBLE      |          |               |
| MESSAGE      | VARCHAR     | 1000     |               |
| TXTIME       | VARCHAR     | 1000     |               |

### nodelist

|    *NAME*    | *DATA TYPE* | *LENGTH* | *PRIMARY KEY* |
| -------------| ----------- | ---------| --------------|
| IP           | VARCHAR     | 50       |               |
| PORT         | VARCHAR     | 50       |               |
| TRIAL        | INT         | 11       |               |

## Post Man

PyCharm Running!

### getBlockData
### GenerateBlock
### getTxData
### newTx
### getNode
### addNode

## Web

### nodejs 실행 (cmd -> 폴더이동 -> supervisor app.js)

* Main : http://localhost/
* BlockData : http://localhost/getBlockData
* TxData : http://localhost/getTxdata
* NodeList : http://localhost/getNodelist

### 조회 방식
* 채굴된 블록 및 원하는 블록 갯수 조회
* txData는 블럭에 반영되지 않는 데이터가 조회
* Fee(수수료), time(생성시간) 순으로 내림차순으로 정렬 조회

```
Error :
Access to XMLHttpRequest at 'URL' from origin 'http://localhost' has been blocked by CORS policy:No 'Access-Control-Allow-Origin' header is present on the requested resource.
```
참고 : https://chrome.google.com/webstore/detail/allow-cors-access-control/lhobafahddgcelffkeicbaginigeejlf
