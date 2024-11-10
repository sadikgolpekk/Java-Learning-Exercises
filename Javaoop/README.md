# Basit OOP Örneği: Araba Uygulaması

Bu proje, Java'da nesne yönelimli programlamanın (OOP) temel kavramlarını öğrenmek amacıyla yapılmış basit bir uygulamadır. Kullanıcıdan araç bilgilerini alır ve bu bilgilerle bir **Araba** nesnesi oluşturur. Sonrasında aracın bilgilerini yazdırır ve hareket etmesini sağlar.

## Proje İçeriği

Bu proje aşağıdaki temel OOP kavramlarını gösterir:

- **Nesneler ve Sınıflar**: Verileri ve işlevleri kapsülleyen sınıflar.
- **Constructor (Yapıcı Metod)**: Nesne oluşturulurken özelliklerin başlatılması.
- **Metotlar**: Nesnelerin davranışlarını yönetir.

## Proje Yapısı

1. **main.java**: Programın ana giriş noktasıdır. Kullanıcıdan aracın **rengi**, **modeli** ve **yaşı** alınır, ardından bir **Araba** nesnesi oluşturulur.
2. **Araba.java**: Aracın özelliklerini tutar ve aracın hareket etmesi, durması gibi işlemleri yöneten metotlar içerir.

## Yapıcı Metod (Constructor)

**Araba** sınıfındaki yapıcı metod, nesne oluşturulurken aracın özelliklerini başlatır.

## Metotlar

- **HaraketEt()**: Aracın hareket etmesini sağlar.
- **Dur()**: Aracın durmasını sağlar.
- **BilgileriYazdir()**: Aracın modelini, rengini ve yaşını yazdırır.
