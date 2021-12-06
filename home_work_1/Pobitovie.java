package HomeWork1;

public class Pobitovie {

    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = -42;
        int e = -15;
        double ho = 42.5;

        System.out.println("Блок а = 42");

        int aa1 = ~ a; // Оператор инвертировал все биты числа, превратив 101010 в 010101
        System.out.println("aa1 " + aa1);
        int aa2 = a & 3; // Оператор оставил равными 1 биты в числе, если таковые равнялись 1 на позициях в операнде, 00101010 & 00000011 превратилось в 0000010
        System.out.println("aa2 " + aa2);
        int aa3 = a &= 3; // Оператор провёл действия аналогичные оператору & и присвоил в переменную полученное значение, а = 0000010(2)
        System.out.println("aa3 " + aa3);
        int aa4 = a | 3; // Оператор присвоил значение 1 битам на позициях, где биты равнялись единицы хотя-бы в одном из двух операндов, 0000010 | 00000011 -> 00000011
        System.out.println("aa4 " + aa4);
        int aa5 = a |= 3; // Оператор провёл действия аналогичные оператору | и присвоил в переменную полученное значение а = 00000011(3)
        System.out.println("aa5 " + aa5);
        int aa6 = a ^ 3; // Оператор присваивает значение 1 битам на тех позициях, где биты равны единице только в одном из операндов, остальным было присвоено значение 0, 00000011 ^ 00000011 -> 00000000
        System.out.println("aa6 " + aa6);
        int aa7 = a ^= 3; // Оператор провёл действия аналогичные оператору ^ и присвоил переменной результат а = 00000000
        System.out.println("aa7 " + aa7);
        int aa8 = a >> 3; // Оператор сместил все биты вправо на указанное количество позиций, результат остался тем же из-за 00000000
        System.out.println("aa8 " + aa8);
        int aa9 = a >>= 3; // Оператор сместил все биты вправо на указанное количество позиций и присвоил результат в переменную, 00000000
        System.out.println("aa9 " + aa9);
        int aa10 = a >>> 3; // Оператор сдвинул все биты вправо на указанное количество позиций, заполнив новые позиции с левой стороны нулями, 00000000
        System.out.println("aa10 " + aa10);
        int aa11 = a << 3; // Оператор сдвинул все биты влево на указанное количествоп позиций, 00000000
        System.out.println("aa11 " + aa11);
        int aa12 = a <<= 3; // Оператор сместил все биты влево на указанное количество позиций и присвоил результат в переменную, 00000000
        System.out.println("aa12 " + aa12);
        int aa13 = a >>>= 3; // Оператор сдвинул все биты вправо на указанное количество позиций, заполнив новые позиции с левой стороны нулями и присвоив значение в переменную, 00000000
        System.out.println("aa13 " + aa13);

        System.out.println("Блок b = 15");

        int bb1 = ~ b;
        System.out.println("bb1 " + bb1);
        int bb2 = b & 3;
        System.out.println("bb2 " + bb2);
        int bb3 = b &= 3;
        System.out.println("bb3 " + bb3);
        int bb4 = b | 3;
        System.out.println("bb4 " + bb4);
        int bb5 = b |= 3;
        System.out.println("bb5 " + bb5);
        int bb6 = b ^ 3;
        System.out.println("bb6 " + bb6);
        int bb7 = b ^= 3;
        System.out.println("bb7 " + bb7);
        int bb8 = b >> 3;
        System.out.println("bb8 " + bb8);
        int bb9 = b >>= 3;
        System.out.println("bb9 " + bb9);
        int bb10 = b >>> 3;
        System.out.println("bb10 " + bb10);
        int bb11 = b << 3;
        System.out.println("bb11 " + bb11);
        int bb12 = b <<= 3;
        System.out.println("bb12 " + bb12);
        int bb13 = b >>>= 3;
        System.out.println("bb13 " + bb13);

        System.out.println("Блок c = -42");

        int cc1 = ~ c;
        System.out.println("cc1 " + cc1);
        int cc2 = c & 3;
        System.out.println("cc2 " + cc2);
        int cc3 = c &= 3;
        System.out.println("cc3 " + cc3);
        int cc4 = c | 3;
        System.out.println("cc4 " + cc4);
        int cc5 = c |= 3;
        System.out.println("cc5 " + cc5);
        int cc6 = c ^ 3;
        System.out.println("cc6 " + cc6);
        int cc7 = c ^= 3;
        System.out.println("cc7 " + cc7);
        int cc8 = c >> 3;
        System.out.println("cc8 " + cc8);
        int cc9 = c >>= 3;
        System.out.println("cc9 " + cc9);
        int cc10 = c >>> 3;
        System.out.println("cc10 " + cc10);
        int cc11 = c << 3;
        System.out.println("cc11 " + cc11);
        int cc12 = c <<= 3;
        System.out.println("cc12 " + cc12);
        int cc13 = c >>>= 3;
        System.out.println("cc13 " + cc13);

        System.out.println("Блок e = -15");

        int ee1 = ~ e;
        System.out.println("ee1 " + ee1);
        int ee2 = e & 3;
        System.out.println("ee2 " + ee2);
        int ee3 = e &= 3;
        System.out.println("ee3 " + ee3);
        int ee4 = e | 3;
        System.out.println("ee4 " + ee4);
        int ee5 = e |= 3;
        System.out.println("ee5 " + ee5);
        int ee6 = e ^ 3;
        System.out.println("ee6 " + ee6);
        int ee7 = e ^= 3;
        System.out.println("ee7 " + ee7);
        int ee8 = e >> 3;
        System.out.println("ee8 " + ee8);
        int ee9 = e >>= 3;
        System.out.println("ee9 " + ee9);
        int ee10 = e >>> 3;
        System.out.println("ee10 " + ee10);
        int ee11 = e << 3;
        System.out.println("ee11 " + ee11);
        int ee12 = e <<= 3;
        System.out.println("ee12 " + ee12);
        int ee13 = e >>>= 3;
        System.out.println("ee13 " + ee13);

        //int zzz = ~ho;

    }
}
