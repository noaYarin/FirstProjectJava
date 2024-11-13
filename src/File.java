public class File {
    private String fileName="";
    private String fileType="";

     File(String _fileName,String _fileType){
        this.fileName=_fileName;
        this.fileType=_fileType;
    }

    private String getFileName(){
         return fileName;
    }

    private String getFileType(){
        return fileType;
    }
}
