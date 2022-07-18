# 第9回講座課題<br>

　localhost:8080/movies?year=2010にアクセスすると、DBに登録されている映画から2010年に公開された映画をレスポンスとして返す。<br><br>
　2010の数値は2010～2019まで変更可能。その範囲外の数値を入力した場合は例外メッセージを返す。<br>

---
## プロジェクト構成
Java 17<br>
Spring Boot 2.7.1<br>
Docker-Compose<br>
MySQL 8.0<br>

---
## 動作概要
▼year=2010<br>
![20220706-task09-00](https://user-images.githubusercontent.com/101798620/177514886-bce609aa-8588-44fb-8966-614c0a1e94f9.png)

▼year=2015<br>
![20220706-task09-01](https://user-images.githubusercontent.com/101798620/177515091-b29f5863-49ce-496f-a18a-444b7ced4452.png)

▼year=2020 (例外メッセージ)<br>
![20220706-task09-02](https://user-images.githubusercontent.com/101798620/177515402-718898cc-b8b1-47d2-8459-8ca3a5fd566f.png)
