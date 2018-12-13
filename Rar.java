public class Rar
{ // does this trigger you? good.
        private int loudness;
        protected String name;

        public static void main(String args[])
        {
                System.out.print("Rar");
                System.out.println("Hi");

                Rar a = new Rar();
                System.out.println(a.nameHeart());
                // can't do this
                //a.sayHi();
                Rar.sayBye();
                a.sayBye();

                Rar b = new Rar("cat");
                System.out.println(b.nameHeart());

                // do you know why this doesn't work?
                //Dad d = new Rar("Hungry");
                Dad d = new Dad();
                System.out.println(d.tellDadJoke());
                System.out.println(d.nameHeart());
                System.out.println(d.sayWhatMate());
                System.out.println(d.ohNaNa());
        }

        // default constructor
        public Rar()
        {
                this.loudness = 0;
                this.name = "Leesin";
        }

        public Rar(String name)
        {
                this.loudness = 1;
                this.name = name;
        }

        // public method
        public String nameHeart()
        {
                return this.name + " to your heart";
        }

        private String sayHi()
        {
                return "no";
        }

        public static void sayBye()
        {
                System.out.println("cya nerds");
        }        

        public String sayWhatMate()
        {
                return "u wot m8";
        }

        public int howLoud()
        {
                return this.loudness;
        }
}