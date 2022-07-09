export interface SmsWatcherPlugin {
  watch(): Promise<{ from: string, body: string }>;
}
