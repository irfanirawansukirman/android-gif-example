package burrows.apps.example.gif.presentation.adapter.model;


/**
 * Model for the GifAdapter in order to display the gifs.
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class ImageInfo {
  final String url;

  public ImageInfo() {
    this(new Builder());
  }

  public ImageInfo(Builder builder) {
    this.url = builder.url;
  }

  public String url() {
    return url;
  }

  public Builder newBuilder() {
    return new Builder(this);
  }

  public static class Builder {
    String url;

    public Builder() {
    }

    public Builder(ImageInfo imageInfo) {
      this.url = imageInfo.url;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public ImageInfo build() {
      return new ImageInfo(this);
    }
  }

  @Override public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final ImageInfo imageInfo = (ImageInfo) o;

    return url != null ? url.equals(imageInfo.url) : imageInfo.url == null;

  }

  @Override public int hashCode() {
    return url != null ? url.hashCode() : 0;
  }
}
