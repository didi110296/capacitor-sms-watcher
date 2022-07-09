export interface SmsWatcherPlugin {
  watch(options: { value: string }): Promise<{ from: string, body: string }>;
}
