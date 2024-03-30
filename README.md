[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/b5ww4GXt)
# 3.Hafta Ödevi

1. Aşağıdaki kavramları örneklerle açıklayın. `(10 PUAN)`  
• Unit test: Yazılımların küçük parçalarına Unit denir. Unitler olabildiğince az ve net fonksiyonlara sahiptirler. Unit test ise ilgili parçanın geliştiricisi tarafından, geliştirme aşamasındayken, istenen fonksiyonu yerine sağlayıp sağlamadığının test edilmesidir.   

    Örneğin bir çalışan yönetimi uygulamasında, çalışan kaydetme fonksiyonunu ele alırsak. Bu fonksiyon, bir çalışanın bilgilerini (ad, soyad, yaş, meslek vb.) alıp veritabanında doğru tabloya eklemeli. Fonksiyonun her seferinde doğru bilgileri, doğru kişiye ve doğru tabloya ekleyip eklemediği kontrol edilir. Hatalı veri girişi yapıldığında (örneğin meslek yerine sayıyla yaş girildiğinde) beklendiği şekilde hata mesajı vermesi de testin bir parçası olabilir.

    • Integration test: Çok sayıda unit bir araya gelip programın tamamını ya da bir bölümünü oluşturduğunda, programın istenen senaryoyu gerçekleştirip gerçekleştirmediği test edilir. Bu test genellikle, geliştirme aşamasından sonra ve kodu geliştirmeyen kişilerce yapılır. 

    Örneğin çalışanın kayıt edilmesi, çalışana sorumlu olduğu müşterilerin eklenmesi ve o müşterilere satış yapılması, çalışanın terfi alması gibi senaryolar integration test kapsamında yapılır. Her aşamanın sorunsuz ve beklendiği şekilde çalıştığı teyit edilir.

2. Aşağıdaki özellikleri **kredinbizde** uygulamasına ekleyin. `(40 PUAN)`  
• Kredinbizde uygulaması için Garanti bankası için client oluşturun.  
• Kullanıcı Garanti bankası için kredi başvurusu yapabilmelidir.  (Bu dizinde bulunan postman collection ile fonksiyon test edilebilir)

• Kullanıcı yapmış olduğu bütün başvuruları görüntüleyebilmelidir.  
• NotificationService için EMAIL,SMS,MOBILE_NOTIFICATION işlemlerini strateji pattern kullanarak implemantasyonu gerçekleştirin.  

3. Docker ile Kafka kurulumu gerçekleştirin ve exception alındığı durumlarda Kafka ile bütün loglar toplanmalı ve MongoDB üzerinde kaydedilmelidir. `(20 PUAN)`

4. Birinci ödevde yaptığınız müşteri, fatura, sipariş ve ürün ile oluşturduğunuz projenizi ayrı servisler olacak şekilde bölün ve aşağıdaki geliştirmeleri ekleyin. `(30 PUAN)`  
• GW ekleyin.  
• Discovery server ekleyin.  
• Fatura bilgilerinin asenkron oluşmasını sağlayan yapıyı kurun.  
• GlobalExceptionHandler ekleyin.  

---
*Eğitmen - Cem DIRMAN*  
*Kolay Gelsin*
