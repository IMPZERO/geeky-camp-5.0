public abstract class FileSystemObject {

    protected Permission permission = Permission.READ_ONLY;
//    protected FileSystemObject parent;
    protected String lastModified = "";

    protected String path = "";
    protected boolean isOpen = false;

    protected abstract void create(FileSystemObject fso);
    protected abstract void open();
    protected abstract void rename(String newName);
    protected abstract void delete(String path);

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public Permission getPermission() {
        return permission;
    }
}
