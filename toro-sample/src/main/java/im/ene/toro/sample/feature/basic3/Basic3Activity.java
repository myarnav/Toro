/*
 * Copyright 2016 eneim@Eneim Labs, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.ene.toro.sample.feature.basic3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by eneim on 6/30/16.
 *
 * Basic sample 3 is similar to Basic sample 1 with some additional use-cases: loop playback and
 * item's interaction (short click, long click).
 *
 * Here we will introduce the following interactions:
 *
 * - Single click to bring an AlertDialog to the Window, meanwhile ask Toro to pause the playback.
 * - Long click to temporarily pause the playback.
 */
public class Basic3Activity extends AppCompatActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
      getSupportFragmentManager().beginTransaction()
          .replace(android.R.id.content, Basic3ListFragment.newInstance())
          .commit();
    }
  }
}
