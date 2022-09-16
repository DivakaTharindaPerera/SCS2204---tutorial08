import scala.math._

case class Point(var x: Double,var y: Double){
    def +(point: Point)=new Point(x + point.x, y + point.y);

    def move(d: Double)={
        x = x * d;
        y = y * d;
    }

    def distance(point: Point)={
        var d= sqrt((y - point.y) * (y - point.y) + (x - point.x) * (x - point.x));
        println(s"Distance : ${d}");
    }

    def invert()={
        val temp = x;
        x = y;
        y = temp;
    }

    def print()={
        println(s"x = ${x}  y = ${y}");
    }
}

object Q1{
    def main(args: Array[String])={
        var p1= Point(2,5);
        var p2= Point(3,0);
        p1.print();
        p2.print();
        p1= p1 + p2;
        println("p1 + p2");
        p1.print();
        p1.move(2);
        p1.print();
        p1.distance(p2);
        p2.invert();
        p2.print();
    }
}