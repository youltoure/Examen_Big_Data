object ExamenBigData {
  def main(args: Array[String]): Unit = {


  }
  //renvoi les objets se terminant par n
  def renvoiList(param:List[String]) :  List[String]={
    val resultat = param.filter(l=>{ l.charAt(l.length-1)=='n'})
    return  resultat
  }

}
