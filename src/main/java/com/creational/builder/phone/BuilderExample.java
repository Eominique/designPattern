package com.creational.builder.phone;

public class BuilderExample {
    public static void main(String[] args) {

  Phone phone=new Phone.Builder()
  .backPanel("Sandstone")
  .frontPanel("ad")
  .camera("12")
  .processor("Snapdragon 625")
  .build();

        System.out.println(phone);

        /*
        1. String Builder
        2. Document Builder
        3. Locale.Builder
        4. Spring Reactive
        5. MockMvcBuilders
         */
    }
}
