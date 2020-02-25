public class Compare {
    
    public static class Dog {
        Dog(String name, String says) {
            this.name = name;
            this.says = says;
        }

        public Boolean equals(Dog dog)
        {
            return this.name == dog.name;
        }
        public String name;
        public String says;
    }
    public static void main(String[] args)
    {
        Dog a = new Dog("a", "one");
        Dog b = new Dog("a", "mew");

        if (a == b)
            System.out.println(a.says);
        else
            System.out.println(b.says);

        if (a.equals(b))
            System.out.println(a.says);
        else
            System.out.println(b.says);

        return;
    }

}