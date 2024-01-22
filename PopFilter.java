public class PopFilter implements GenreFilter {

    @Override
    public boolean permit(Album album) {
        return album.genre().equals(Album.Genre.POP.toString());
    }
}
