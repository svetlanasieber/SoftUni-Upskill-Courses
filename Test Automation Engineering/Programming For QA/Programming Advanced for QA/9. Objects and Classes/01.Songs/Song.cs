public class Song
{
   
    public string TypeList { get; set; }
    public string Name { get; set; }
    public string Time { get; set; }

 

  
    public Song(string typeList, string name, string time)
    {
   
        TypeList = typeList;
        Name = name;
        Time = time;
    }

}


