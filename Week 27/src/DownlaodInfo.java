import java.util.ArrayList;

//Arshia Kohanteb - Download Info - AP Comp Sci

public class MusicDownloads {

	private List<DownloadInfo> downloadList;

	public MusicDownloads() {
		downloadList = new ArrayList<DownloadInfo>();
	}

	public DownloadInfo getDownloadInfo(String title) {

		for (DownloadInfo download : downloadList) 
		{
			if ((download.getTitle()).equals(title)) 
			{
				return download;
			} 
			
			else
			{
				return null;
			}
		}

	}

	public void updateDownloads(ArrayList<String> titles) 
	{
		 for (String title: titles) {
		        DownloadInfo find = getDownloadInfo(title);
		        if (find == null) {
		            downloadList.add(new DownloadInfo(title));
		        }
		        else {
		            find.incrementTimesDownloaded(); 
		        }
		    }
	}
	
}