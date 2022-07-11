package me.dio.simulator2.data;

import java.util.List;

import me.dio.simulator2.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {


    @GET("Matches.json")
    Call<List<Match>> getMaches();
}
