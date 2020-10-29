case class Cell(x:Int, y:Int, otype:String)
case class Field(cells:Vector[Cell])
case class Character(name:String, mrange:Int, srange:Int, damage:Int, hp:Int, side:Int, cell:Cell)

val field1 = Field(Vector[Cell](
  Cell(0, 0, "X"), Cell(1, 0, "X"), Cell(2, 0, "X"), Cell(3, 0, "X"), Cell(4, 0, "X"), Cell(5, 0, "X"),
  Cell(0, 1, "X"), Cell(1, 1, "X"), Cell(2, 1, "R"), Cell(3, 1, "X"), Cell(4, 1, "X"), Cell(5, 1, "X"),
  Cell(0, 2, "X"), Cell(1, 2, "R"), Cell(2, 2, "R"), Cell(3, 2, "R"), Cell(4, 2, "X"), Cell(5, 2, "X"),
  Cell(0, 3, "X"), Cell(1, 3, "X"), Cell(2, 3, "X"), Cell(3, 3, "X"), Cell(4, 3, "X"), Cell(5, 3, "X"),
  Cell(0, 4, "X"), Cell(1, 4, "X"), Cell(2, 4, "X"), Cell(3, 4, "X"), Cell(4, 4, "X"), Cell(5, 4, "X"),
  Cell(0, 5, "X"), Cell(1, 5, "X"), Cell(2, 5, "x"), Cell(3, 5, "X"), Cell(4, 5, "X"), Cell(5, 5, "X"),
  Cell(0, 6, "X"), Cell(1, 6, "X"), Cell(2, 6, "X"), Cell(3, 6, "X"), Cell(4, 6, "X"), Cell(5, 6, "X"),
))


val sniper = Character("Sniper", 5, 10, 70, 40, 0, Cell(-10, -10, "Gaveyard")) //field1.cells(15)


var count = 0
var temp = "     A   B   C   D   E   F \n"
temp +=    "  ------------------------\n"

for (i <- 0 to 6){
  //print(i)
  temp += (i + " |")
  for (j <- 0 to 5){
    //print(temp +j)

    if(sniper.cell == field1.cells(count + j)){
      //print(" C1 ")
      temp += " C1 "
    }else{
      //print("  " + field1.cells( count + j ).otype + " ")
      temp += "  "
      temp += field1.cells( count + j ).otype
      temp += " "
    }
  }
  temp += "\n"
  count = count + 6
}

printf(temp)



field1.cells(0).x
field1.cells(0).y

field1.cells(1).x
field1.cells(1).y
field1.cells(1).otype

println("_____")
println(field1.cells(0).otype + " | " + field1.cells(1).otype)
println("------")
println(field1.cells(6).otype + " | " + field1.cells(7).otype)
println("------")

sniper.mrange
sniper.cell.otype
sniper.cell.x
