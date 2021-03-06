package com.alirezaafkar.phuzei.injection.component

import com.alirezaafkar.phuzei.injection.module.ContextModule
import com.alirezaafkar.phuzei.injection.module.DataModule
import com.alirezaafkar.phuzei.injection.module.NetworkModule
import com.alirezaafkar.phuzei.presentation.album.AlbumPresenter
import com.alirezaafkar.phuzei.presentation.login.LoginActivity
import com.alirezaafkar.phuzei.presentation.login.LoginPresenter
import com.alirezaafkar.phuzei.presentation.main.MainPresenter
import com.alirezaafkar.phuzei.presentation.muzei.PhotosArtProvider
import com.alirezaafkar.phuzei.presentation.muzei.PhotosArtSource
import com.alirezaafkar.phuzei.presentation.muzei.PhotosWorker
import com.alirezaafkar.phuzei.presentation.splash.SplashActivity
import com.alirezaafkar.phuzei.util.TokenAuthenticator
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Alireza Afkar on 16/3/2018AD.
 */
@Singleton
@Component(modules = [ContextModule::class, NetworkModule::class, DataModule::class])
interface MainComponent {
    fun inject(photosWorker: PhotosWorker)
    fun inject(loginActivity: LoginActivity)
    fun inject(mainPresenter: MainPresenter)
    fun inject(loginPresenter: LoginPresenter)
    fun inject(albumPresenter: AlbumPresenter)
    fun inject(splashActivity: SplashActivity)
    fun inject(photosArtSource: PhotosArtSource)
    fun inject(photosArtProvider: PhotosArtProvider)
    fun inject(tokenAuthenticator: TokenAuthenticator)
}
