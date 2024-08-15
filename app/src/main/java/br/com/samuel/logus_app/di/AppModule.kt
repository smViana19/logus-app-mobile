package br.com.samuel.logus_app.di

import android.content.Context
import br.com.samuel.logus_app.backendservices.api.ApiService
import br.com.samuel.logus_app.backendservices.sharedprefs.SharedPrefsService
import br.com.samuel.logus_app.backendservices.sharedprefs.SharedPrefsServiceImpl
import br.com.samuel.logus_app.constants.APP_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(APP_URL) //colocar A URL AQUI SELECIONAR HTTP OU STRING DEPENDE DO QUE FOR
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun provideSharedPrefsService(@ApplicationContext context: Context): SharedPrefsService {
        return SharedPrefsServiceImpl(context)
    }
}