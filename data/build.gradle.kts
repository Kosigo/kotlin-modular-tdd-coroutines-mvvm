/*
 * Copyright 2019 nuhkoca.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import dependencies.Dependencies

plugins {
    id(Plugins.commonAndroidLibrary)
}

val baseUrl: String by project

android {

    buildTypes.forEach {
        it.buildConfigField("String", "baseUrl", baseUrl)
    }
}

dependencies {
    api(Dependencies.gson)
    api(Dependencies.retrofit)
    api(Dependencies.okHttp)
    api(Dependencies.logging)
}
