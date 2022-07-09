import { WebPlugin } from '@capacitor/core';

import type { SmsWatcherPlugin } from './definitions';

export class SmsWatcherWeb extends WebPlugin implements SmsWatcherPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
