package artifactId.repository;

import artifactId.Video;

import java.util.List;

public interface VideoRepository {
    List<Video> listAll();
    Video All(Video video);
    List<Video> Search(String title);
    List<Video> Search(Double duration, Double durationUpTo);
}
