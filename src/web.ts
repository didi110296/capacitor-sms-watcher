import { WebPlugin } from '@capacitor/core';

import type { SmsWatcherPlugin } from './definitions';

export class SmsWatcherWeb extends WebPlugin implements SmsWatcherPlugin {
  async watch(): Promise<{ from: string, body: string }> {
    return {
        from: '',
        body: ''
    };
  }
}
