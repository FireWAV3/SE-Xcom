case class Cell(x:Int, y:Int, otype:String)
case class Field(cells:Vector[Cell])
case class Character(name:String, mrange:Int, srange:Int, damage:Int, hp:Int, side:Int, cell:Cell)

val field1 = Field(Vector[Cell](Cell(0,0,"S"), Cell(1,0, "R"),
  Cell(0,0, "X"), Cell(1,1, "X")))


val sniper = Character("Sniper", 5, 10, 70, 40, 0, field1.cells(0))

field1.cells(0).x
field1.cells(0).y

field1.cells(1).x
field1.cells(1).y
field1.cells(1).otype

println("_____")
println(field1.cells(2).otype + " | " + field1.cells(3).otype)
println("------")
println(field1.cells(0).otype + " | " + field1.cells(1).otype)
println("------")

sniper.mrange
sniper.cell.otype
sniper.cell.x
