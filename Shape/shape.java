class shape
{
float a,b,c;
public:
void read()
{
 Scanner in = new Scanner(System.in);
system.out.println("enter a parameters");
float a=in.nextInt();
float b=in.nextInt();
float c=in.nextInt();
}
};
class rect:public shape
{
public:
float area()
{
system.out.println("rect area is"a*b);
system.out.println("rect parimater"2*a+2*b);

}
};
class triangle:public shape
{
public:
float area()
{
system.out.println("triangle area is"a*b/2);
system.out.println("triangle parimater"a+b+c);
}
};
void main()
{
rect r=new rect;
triangle t=new triangle;
r.read();
t.read();
system.out.println("triangle area and parimeter is" r.area());
system.out.println("triangle area and parimateris"t.area());
getch();
}

