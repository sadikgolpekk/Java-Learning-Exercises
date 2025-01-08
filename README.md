# JAVA NEDİR ?
![developpement_java_maroc-1](https://github.com/user-attachments/assets/37ff3acf-d1af-4931-9c75-4559727505c6)

Java, popüler bir programlama dilidir ve geniş bir kullanım alanına sahiptir. Başlangıçta, Sun Microsystems tarafından geliştirilmiş olan bu dil, daha sonra Oracle tarafından satın alınmıştır. Java'nın en belirgin özelliklerinden biri, "Bir kez derle, her yerde çalıştır" (Compile once, run anywhere) ilkesini benimsemesidir. Bu özellik sayesinde Java programları farklı platformlarda tekrar derleme gerekmeksizin çalışabilir.



## JVM - Java Sanal Makinesi

Java uygulamaları, doğrudan donanım üzerinde çalışmaz. Bunun yerine, derlenmiş Java kodu (bytecode) JVM (Java Virtual Machine) üzerinde çalıştırılır. Bu yapı, platform bağımsızlığını mümkün kılar ve Java'nın esnekliğini artırır.

## Java Programlarının İki Türü

### Uygulamalar (Applications)

- Normal programlardır.
- Bilgisayarınızda çalıştırılmak üzere tasarlanmıştır.

### Appletler (Applets)

- Küçük uygulamalardır.
- İnternette başka bir konuma gönderilmek ve orada çalıştırılmak üzere tasarlanmıştır.

## Programlama ve Kullanıcı Kavramları

- Bir programı yazan kişiye **programcı** (programmer) denir.
- Programla etkileşime giren kişiye ise **kullanıcı** (user) denir.

![java1](https://github.com/user-attachments/assets/20337b96-bc52-467a-a679-05858c62dbc5)

## Paketler (Packages)

- **Paket** (package), önceden tanımlanmış sınıflardan oluşan bir kütüphanedir.
- Örneğin, tüm yardımcı sınıfları içeren `java.util` paketini kullanmak için şu şekilde ekleme yapılır:
  ```java
  import java.util.*;
  ```


## Temel Programlama Kavramları

- Parantez içindeki öğelere **argüman** (argument) denir ve bu öğeler, yöntemlerin ihtiyaç duyduğu bilgileri sağlar.
- **Değişken** (variable), veri depolayabilen bir yapıdır.
- Bilgisayara verilen bir talimat **ifadeye** (statement) denir; bu talimat noktalı virgül (`;`) ile sonlanır.
- Bir programlama dilinin dilbilgisi kuralları, o dilin **sözdizimi** (syntax) olarak adlandırılır.

## Ekrana Çıktı Alma

- `System.out.println` ifadesi, parantez içindeki bilgiyi ekrana yazdırır ve ardından bir alt satıra geçer.
  ```java
  System.out.println("Ne yazmak istiyorsanız buraya yazın");
  ```
- `System.out` bir nesnedir ve ekrana çıktı göndermek için kullanılır.
- `println` ise bir yöntemdir ve parantez içindeki ifadeyi ekrana yazdırır.

### `System.out.print` Kullanımı

- `System.out.print`, `println` gibi çalışır ancak bir alt satıra geçmez.

### Örnek

```java
int var = 3;
System.out.println(var + " kez A");
```

## Kullanıcıdan Veri Alma

- Bazen bir hesaplama için gereken veri, çalışma zamanında kullanıcıdan alınır.
- Klavyeden giriş almak için dosyanın başına şu satır eklenmelidir:
  ```java
  import java.util.*;
  ```
- Klavyeden veri girişi yapmak için `Scanner` sınıfı kullanılır:
  ```java
  Scanner keyboard = new Scanner(System.in);
  ```
  Örnek kullanım:
  ```java
  int eggsPerBasket = keyboard.nextInt();
  double d1 = keyboard.nextDouble();
  ```
  Bu kod, klavyeden bir tam sayı alır ve `eggsPerBasket` değişkenine atar.

## Java Programının Yapısı

- Bir Java programı, bir veya daha fazla sınıftan oluşur.
- Program çalıştırılmadan önce tüm sınıfların derlenmesi gerekir.
- Ancak, Java ile birlikte gelen sınıflar (örneğin `System` ve `Scanner`) için derleme gerekmez.

### `main` Metodu

- Çalıştırılacak sınıf, dosyanın başında şu ifadeyi içermelidir:
  ```java
  public static void main(String[] args)
  ```

### Dosya Adlandırma Kuralları

- Her sınıf ayrı bir dosyada olmalıdır.
- Dosya adı, sınıf adıyla aynı olmalıdır.

## Derleme ve Çalıştırma Komutları

![Java-Interpreter-Step-by-Step1](https://github.com/user-attachments/assets/204d61e1-354c-4778-8b0f-38d5f4973e3e)

- Bir Java programı derlendiğinde, programın byte-code sürümü `.java` uzantısından `.class` uzantısına dönüştürülür.
  ```
  [project_path]>javac Lab_1/HelloWorld.java
  ```
  Bu işlem `HelloWorld.class` dosyasını oluşturur. Bu dosya bytecode ya da hedef sınıf (target class) olarak adlandırılır.

- Bytecode çalıştırma:
  ```
  [project_path]>java Lab_1/HelloWorld Ahmet
  ```
  Çıktı:
  ```
  Hello World!
  Ahmet
  ```

- Argümanlarla çalışma:
  ```java
  [project_path]>java Lab_1/HelloWorld Ahmet Sayar
  ```
  Çıktı: ???
  `System.out.println(args[2])` çıktısı ne olur?

## Önemli Kavramlar ve Sorular

- **JVM (Java Virtual Machine)** nedir?
  JVM, Java programlarını çalıştıran sanal bir makinedir. Bytecode'u yorumlar ve çalıştırır. Platform bağımsızlığı sağlayan en önemli bileşendir.

- **Bytecode**, **kaynak kod** (source code) ve **hedef kod** (target code) nedir?
  - Kaynak kod (source code): Programcının yazdığı insan tarafından okunabilir koddur. Örneğin: `.java` dosyaları.
  - Bytecode: Derleyici tarafından üretilen ve JVM'in çalıştırabileceği ara koddur. Örneğin: `.class` dosyaları.
  - Hedef kod (target code): Programın, belirli bir platform için makine diline çevrilmiş halidir.

- Java taşınabilir midir? Nasıl?
  Evet, Java taşınabilirdir. Bytecode, herhangi bir platformda çalışan JVM üzerinde çalıştırılabilir.

- **Java SDK** nedir?
  Java SDK (Software Development Kit), Java uygulamaları geliştirmek için gerekli araçları içerir. Derleyici, JVM ve kitaplıklar gibi bileşenler içerir.

- **Java JRE** nedir?
  Java JRE (Java Runtime Environment), Java programlarını çalıştırmak için gerekli olan ortamdır. JVM ve temel sınıf kütüphanelerini içerir.

- Genel olarak:
  - **Linking** nedir?
    Programın farklı modüllerinin bir araya getirilip çalıştırılabilir bir hale getirilmesidir.
  - **Loading** nedir?
    Programın çalıştırılmadan önce belleğe yüklenme işlemidir.
  - **Derleme (compiling)** nedir?
    Kaynak kodun makine diline veya bytecode'a çevrilmesi işlemidir.
  - **Yorumlama (interpreting)** nedir?
    Programın kaynak kodunun satır satır çalıştırılmasıdır.

- Java derleyici tabanlı mı, yorumlayıcı tabanlı mı? Nasıl?
  Java, hem derleyici hem de yorumlayıcı tabanlıdır. Kaynak kod önce derlenir (bytecode'a çevrilir), ardından JVM bu bytecode'u yorumlayarak çalıştırır.

- Kaynak kodun uzantısı nedir?
  `.java`

- Bytecode (hedef kod) uzantısı nedir?
  `.class`

- Bir Java sınıfını derlemek için komut nedir?
  ```
  javac ClassName.java
  ```

- Bir Java sınıfını çalıştırmak için komut nedir?
  ```
  java ClassName
  ```

- Java her platformda çalışabilir mi?
  Evet, JVM'in bulunduğu her platformda çalışabilir.

- HTML içine gömülü ve web ortamında çalışan küçük Java kodlarına ne ad verilir?
  Applet.

- **Kapsülleme (encapsulation)** nedir?
  Verilerin ve bu verilere erişim yöntemlerinin bir sınıf içerisinde saklanması ve dış dünyadan gizlenmesidir. Bu sayede, veri güvenliği ve program modülerliği sağlanır.


# Java Kimlik Kuralları (Identifiers)

![variables](https://github.com/user-attachments/assets/a56d5dc8-e7e0-4260-b5cf-56bbb3762c25)

## Kimlikler (Identifiers)

Java'da **kimlikler** (identifiers), değişkenlerin, metodların veya sınıfların isimleridir. Bir kimlik, yalnızca harfler, rakamlar, alt çizgi karakteri (_) ve dolar işareti ($) içerebilir. Ayrıca, bir kimlik **rakamla** başlayamaz. Türkçe karakterler de kullanılabilir.

### Geçerli Kimlik Kuralları:
- **Harfler** (büyük ve küçük harfler) içerebilir.
- **Sayılardan** başlamamalıdır (ilk karakter sayı olamaz).
- **Sayılardan** (0-9), **harflerden**, **alt çizgi (_) karakteri** ve bazı **para birimi sembollerinden** (dolar $, sterlin £, euro €) kullanılabilir.
- **Boşluk**, **nokta (.)**, **yıldız (*)**, **@** gibi özel karakterler içeremez.
- **Türkçe karakterler** kullanılabilir.

### Geçerli Kimlikler:
Aşağıdaki değişken isimleri **geçerli** kimliklerdir çünkü Java'nın kurallarına uyar:

- `int test1;`  *(Geçerli: Sayılar içerebilir, ancak ilk karakter rakam olmamalıdır.)*
- `int test23we;` *(Geçerli: Sayı ve harf karışımı olmasına rağmen, ilk karakter rakam değildir.)*
- `int df_;` *(Geçerli: Alt çizgi (_) kullanılabilir.)*
- `int sd$;` *(Geçerli: Dolar işareti ($) kullanılabilir.)*
- `int şşt;` *(Geçerli: Türkçe karakterler kullanılabilir.)*

### Geçersiz Kimlikler:
Aşağıdaki değişken isimleri **geçersiz** kimliklerdir çünkü Java'nın kurallarına aykırıdır:

- `int k!34;`  *(Geçersiz: İçinde `!` karakteri bulunuyor.)*
- `int 2dfg;`  *(Geçersiz: İlk karakter rakamla başlıyor.)*
- `int @kl;`   *(Geçersiz: İçinde `@` sembolü bulunuyor.)*
- `int k.t;`   *(Geçersiz: İçinde nokta (.) karakteri bulunuyor.)*
- `int k-t;`   *(Geçersiz: İçinde tire (-) karakteri bulunuyor.)*
- `int a ei;`  *(Geçersiz: İçinde boşluk bulunuyor.)*

### Notlar:
- Kimlikler **istediğiniz kadar uzun** olabilir.
- Java, **büyük/küçük harf duyarlıdır**, yani `stuff`, `Stuff` ve `STUFF` üç farklı kimliktir.
- **Anahtar Kelimeler** (örneğin, `int`, `public`, `class`, `if`) özel anlamlara sahip olduğundan, kimlik olarak kullanılamazlar.

## Sonuç:
Java'da bir kimlik belirlerken, yukarıdaki kurallara uymanız gerekmektedir. Kimlikler sadece harfler, sayılar, alt çizgi (_) ve para birimi sembollerini içerebilir. İlk karakterin bir rakam olmaması gerektiğini unutmayın. Ayrıca, özel semboller ve boşluk gibi karakterler geçerli kimlik isimlerinde bulunmamalıdır.


# Java'da Dizi Tanımlama

Java'da diziler, aynı türdeki öğeleri saklayan veri yapılarına verilen isimdir. Diziler sabit boyutlu olup, her elemanın türü aynı olmalıdır.

## Dizi Tanımlama

Bir dizi tanımlamak için şu sözdizimi kullanılır:

```java
<veri_türü>[] <dizi_adı>;

int[] numbers = new int[5];
String[] names = new String[3];



