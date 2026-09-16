//Streams : Sequence of bytes.
//IO Streams Input output streams:
//Harddisk : permanent storage.

import java.io.*;

class ListDrives
{
	public static void main(String args[])
	{
		File[]	drives;

		drives = File.listRoots();
		
		File[] file=drives.listFile();
		for(File drive : file)
		{
			System.out.println(drive.getName());
			System.out.println(drive.getTotalSpace());
		}
		
	}
}
