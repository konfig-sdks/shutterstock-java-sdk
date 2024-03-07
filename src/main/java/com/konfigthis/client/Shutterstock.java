package com.konfigthis.client;

import com.konfigthis.client.api.AudioApi;
import com.konfigthis.client.api.CatalogApi;
import com.konfigthis.client.api.ComputerVisionApi;
import com.konfigthis.client.api.ContributorsApi;
import com.konfigthis.client.api.CustomMusicApi;
import com.konfigthis.client.api.EditorialImagesApi;
import com.konfigthis.client.api.EditorialVideoApi;
import com.konfigthis.client.api.ImagesApi;
import com.konfigthis.client.api.OauthApi;
import com.konfigthis.client.api.SoundEffectsApi;
import com.konfigthis.client.api.TestApi;
import com.konfigthis.client.api.UsersApi;
import com.konfigthis.client.api.VideosApi;

public class Shutterstock {
    private ApiClient apiClient;
    public final AudioApi audio;
    public final CatalogApi catalog;
    public final ComputerVisionApi computerVision;
    public final ContributorsApi contributors;
    public final CustomMusicApi customMusic;
    public final EditorialImagesApi editorialImages;
    public final EditorialVideoApi editorialVideo;
    public final ImagesApi images;
    public final OauthApi oauth;
    public final SoundEffectsApi soundEffects;
    public final TestApi test;
    public final UsersApi users;
    public final VideosApi videos;

    public Shutterstock() {
        this(null);
    }

    public Shutterstock(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.audio = new AudioApi(this.apiClient);
        this.catalog = new CatalogApi(this.apiClient);
        this.computerVision = new ComputerVisionApi(this.apiClient);
        this.contributors = new ContributorsApi(this.apiClient);
        this.customMusic = new CustomMusicApi(this.apiClient);
        this.editorialImages = new EditorialImagesApi(this.apiClient);
        this.editorialVideo = new EditorialVideoApi(this.apiClient);
        this.images = new ImagesApi(this.apiClient);
        this.oauth = new OauthApi(this.apiClient);
        this.soundEffects = new SoundEffectsApi(this.apiClient);
        this.test = new TestApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
        this.videos = new VideosApi(this.apiClient);
    }

}
