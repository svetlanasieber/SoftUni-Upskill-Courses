int countSongs = int.Parse(Console.ReadLine()); 


List<Song> songsList = new List<Song>();

for (int count = 1; count <= countSongs; count++)
{
    
    string data = Console.ReadLine();
    string[] songData = data.Split("_");


    string typeList = songData[0]; 
    string songName = songData[1]; 
    string time = songData[2];   

  
    Song song = new Song(typeList, songName, time);

    
    songsList.Add(song);
}



string typeSongToPrint = Console.ReadLine();

foreach (Song song in songsList)
{
    if (typeSongToPrint == "all" || typeSongToPrint == song.TypeList)
    {
        Console.WriteLine(song.Name);
    }
}
