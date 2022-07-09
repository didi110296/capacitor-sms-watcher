import { registerPlugin } from '@capacitor/core';

import type { SmsWatcherPlugin } from './definitions';

const SmsWatcher = registerPlugin<SmsWatcherPlugin>('SmsWatcher', {
  web: () => import('./web').then(m => new m.SmsWatcherWeb()),
});

export * from './definitions';
export { SmsWatcher };
