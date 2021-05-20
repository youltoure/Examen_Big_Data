object ExamenBigData {
  def main(args: Array[String]): Unit = {
    val mali :List[String] = List("julien","Paul","jean","rac","trec","joel","ed","chris","maurice")
    println(renvoiList(mali))
    lis_Double()

  }
  //renvoi les objets se terminant par n
  def renvoiList(param:List[String]) :  List[String]={
    val resultat = param.filter(l=>{ l.charAt(l.length-1)=='n'})
    return  resultat
  }
  def lis_Double():Unit={
    val  Maliste = List(List("ecommercemag.fr"," "),List("https://www.journalducm.com/contact/","Payant"),
      List("https://www.zatsaz.com/",""),List("https://www.lerevenu.com",""),
      List("https://www.cadre-dirigfdeant-magazine.com/","payant"),
      List("https://www.silicon.fr/services/contact#annoncer/","Payant"),
      List("https://www.channelbiz.fr/nous-contacter/",""),
      List("https://www.itespresso.fr/",""),
      List("https://www.industrie-mag.com/article4.html","invite"),
      List("https://www.jesuisundev.com/article-invite/","invite"),
      List("https://www.numerama.com/",""))
    //Maliste.foreach(l=>{println(l(0)+" "+l(1))})
    val k1 = Maliste.map(l=>{
      if(l(0).contains("https://www."))
      { //println(l(0))s
        List(  l(0).substring(12), l(1))


      }
      else
      {
        List(l(0),l(1))
      }
    } )
    k1.foreach(l1=>{println(l1)})

  }

}
