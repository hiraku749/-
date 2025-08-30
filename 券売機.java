public class 券売機 {
 public static void main(String[] args) {
System.out.println("今からあなたにはラーメンを頼んでもらいます。");
System.out.println("へいお兄ちゃん！ラーメンいるか？");
 System.out.println("ラーメンを選んでください。");
 System.out.println("とんこつ");
  System.out.println("しょうゆ");
  System.out.println("みそ");
  System.out.println("しお");
 String ラーメン = new java.util.Scanner(System.in).nextLine();
 switch (ラーメン) {
    case "しょうゆ" -> {
    System.out.println("はいよ。しょうゆだよ。");
    System.out.println("それじゃ、9000000円だよ");
    System.out.println("何円渡す？");
    int 金額 = new java.util.Scanner(System.in).nextInt();

    if (金額 >= 5000) { // 5000円以上
        System.out.println("お金が足りません");
    } else { // 5000円以内
        System.out.println("足りねえぞ！");
        System.out.println("払えねえのか！！？？");
        System.out.println("あなたは捕まった。");
    }
}

    case "みそ" -> {
    System.out.println("はいよ。みそだよ。");
    System.out.println("それじゃ、9000000円だよ");
    System.out.println("何円渡す？");
    int 金額 = new java.util.Scanner(System.in).nextInt();

    if (金額 >= 5000) { // 5000円以上
        System.out.println("お金が足りません");
    } else { // 5000円以内
        System.out.println("足りねえぞ！");
        System.out.println("払えねえのか！！？？");
        System.out.println("あなたは捕まった。");
    }
}

   case "しお" -> {
    System.out.println("はいよ。しおだよ。");
    System.out.println("それじゃ、9000000円だよ");
    System.out.println("何円渡す？");
    int 金額 = new java.util.Scanner(System.in).nextInt();

    if (金額 >= 5000) { // 5000円以上
        System.out.println("お金が足りません");
    } else { // 5000円以内
        System.out.println("足りねえぞ！");
        System.out.println("払えねえのか！！？？");
        System.out.println("あなたは捕まった。");
    }
}
    case "とんこつ" -> {
    System.out.println("はいよ。とんこつだよ。");
    System.out.println("それじゃ、9000000円だよ");
    System.out.println("何円渡す？");
    int 金額 = new java.util.Scanner(System.in).nextInt();

    if (金額 >= 5000) { // 5000円以上
        System.out.println("お金が足りません");
    } else { // 5000円以内
        System.out.println("足りねえぞ！");
        System.out.println("払えねえのか！！？？");
        System.out.println("あなたは捕まった。");
    }
}

 }
 System.out.println("お疲れさまでした");
 }
}



