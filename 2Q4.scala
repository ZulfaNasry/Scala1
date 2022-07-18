object main extends App{
    def nrml_H(h1:Int)=h1*150
    def OT_H(h2:Int)=h2*75
    def income(h1:Int,h2:Int):Int=nrml_H(h1)+OT_H(h2)
    def tax(income:Int):Double=income*.1
    def salary(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2))

    println(salary(40,20))


}
