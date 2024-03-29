/*
 * Shutterstock API Explorer
 * The Shutterstock API provides access to Shutterstock's library of media, as well as information about customers' accounts and the contributors that provide the media.
 *
 * The version of the OpenAPI document: 1.1.32
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AudioRendersListResults;
import com.konfigthis.client.model.CreateAudioRender;
import com.konfigthis.client.model.CreateAudioRendersRequest;
import com.konfigthis.client.model.DescriptorsListResult;
import com.konfigthis.client.model.InstrumentsListResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomMusicApi
 */
@Disabled
public class CustomMusicApiTest {

    private static CustomMusicApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CustomMusicApi(apiClient);
    }

    /**
     * Create rendered audio
     *
     * This endpoint creates rendered audio from timeline data. It returns a render ID that you can use to download the finished audio when it is ready. The render ID is valid for up to 48 hours.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRenderedAudioTest() throws ApiException {
        List<CreateAudioRender> audioRenders = null;
        AudioRendersListResults response = api.createRenderedAudio(audioRenders)
                .execute();
        // TODO: test validations
    }

    /**
     * Get details about audio renders
     *
     * This endpoint shows the status of one or more audio renders, including download links for completed audio.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAudioRendersDetailsTest() throws ApiException {
        List<String> id = null;
        AudioRendersListResults response = api.getAudioRendersDetails(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List computer audio descriptors
     *
     * This endpoint lists the descriptors that you can use in the audio regions in an audio render.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAudioDescriptorsTest() throws ApiException {
        Double renderSpeedOver = null;
        String bandId = null;
        String bandName = null;
        Integer page = null;
        Integer perPage = null;
        List<String> id = null;
        String instrumentName = null;
        String instrumentId = null;
        Double tempo = null;
        Double tempoTo = null;
        Double tempoFrom = null;
        String name = null;
        String tag = null;
        DescriptorsListResult response = api.listAudioDescriptors()
                .renderSpeedOver(renderSpeedOver)
                .bandId(bandId)
                .bandName(bandName)
                .page(page)
                .perPage(perPage)
                .id(id)
                .instrumentName(instrumentName)
                .instrumentId(instrumentId)
                .tempo(tempo)
                .tempoTo(tempoTo)
                .tempoFrom(tempoFrom)
                .name(name)
                .tag(tag)
                .execute();
        // TODO: test validations
    }

    /**
     * List computer audio instruments
     *
     * This endpoint lists the instruments that you can include in computer audio. If you specify more than one search parameter, the API uses an AND condition.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listComputerAudioInstrumentsTest() throws ApiException {
        List<String> id = null;
        Integer perPage = null;
        Integer page = null;
        String name = null;
        String tag = null;
        InstrumentsListResult response = api.listComputerAudioInstruments()
                .id(id)
                .perPage(perPage)
                .page(page)
                .name(name)
                .tag(tag)
                .execute();
        // TODO: test validations
    }

}
