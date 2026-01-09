/**
 * This stub is provided to make it straightforward to get started.
 */

export function twoFer(Name?:string): string {
  if (!Name) {
    return "One for you, one for me.";
  } else {
    return `One for ${Name}, one for me.`;
  }
}
